SUMMARY = "Pyxis Image"
DESCRIPTION = "Customized image for meta-chprat"

LICENSE = "MIT"

inherit core-image

export IMAGE_BASENAME = "pyxis-image"

CORE_IMAGE_BASE_INSTALL:append = " packagegroup-pyxis-general"

CORE_IMAGE_BASE_INSTALL:append = " ${@bb.utils.contains('MACHINE_FEATURES', 'printing', ' packagegroup-printing', '', d)}"
CORE_IMAGE_BASE_INSTALL:append = " ${@bb.utils.contains('MACHINE_FEATURES', '3d-printing', ' packagegroup-3d-printing', '', d)}"
