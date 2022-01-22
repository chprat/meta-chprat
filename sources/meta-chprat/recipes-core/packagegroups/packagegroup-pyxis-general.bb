DESCRIPTION = "Customized packagegroup of general needed packages"
SUMMMARY = "Packagegroup containing general dependencies"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN}:append = " wpa-supplicant"
RDEPENDS:${PN}:append = " dhcpcd"
