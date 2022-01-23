SUMMARY = "Example recipe for using inherit useradd"
DESCRIPTION = "This recipe serves as an example for using features from useradd.bbclass"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "file://authorized_keys"

inherit useradd

USERADD_PACKAGES = "${PN}"

USERADD_PARAM:${PN} = "-s /bin/sh -g cpr cpr"
GROUPADD_PARAM:${PN} = "cpr"

do_install () {
    install -d -m 755 ${D}/home/
    install -d -m 755 ${D}/home/cpr
    install -d -m 755 ${D}/home/cpr/.ssh/
    install -p -m 644 ${WORKDIR}/authorized_keys ${D}/home/cpr/.ssh/authorized_keys
    chown -R cpr ${D}/home/cpr
    chgrp -R cpr ${D}/home/cpr/
}

FILES:${PN} = "/home/cpr/.ssh/authorized_keys"

# Prevents do_package failures with:
# debugsources.list: No such file or directory:
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
