IMAGE_FSTYPES:remove = "tar.bz2"
IMAGE_FSTYPES:remove = "ext3"
IMAGE_FSTYPES:append = " ext4.gz"

# This setting is needed when enabling using RPI_USE_U_BOOT
# as otherwise the device won't boot up
ENABLE_UART = "1"

WKS_FILE = "swupdate-raspberrypi.wks"
