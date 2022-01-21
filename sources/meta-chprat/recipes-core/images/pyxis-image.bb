SUMMARY = "Pyxis Image"
DESCRIPTION = "Customized image for meta-chprat"

LICENSE = "MIT"

inherit core-image

export IMAGE_BASENAME = "pyxis-image"

CORE_IMAGE_BASE_INSTALL:append = " ${@bb.utils.contains('MACHINE_FEATURES', 'printing', ' packagegroup-printing', '', d)}"
