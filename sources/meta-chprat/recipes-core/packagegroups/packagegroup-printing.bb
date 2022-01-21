DESCRIPTION = "Customized packagegroup to run a print server"
SUMMMARY = "Packagegroup containing dependencies for a print server"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN}:append = " cups"
