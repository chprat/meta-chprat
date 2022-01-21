DESCRIPTION = "Customized packagegroup to run a 3D print server"
SUMMMARY = "Packagegroup containing dependencies for a 3D print server"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} = "octoprint"
