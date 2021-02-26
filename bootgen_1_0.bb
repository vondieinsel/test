SUMMARY = "simple bootgen application from xillinx"
DESCRIPTION = "bootgen"
LICENSE = "CLOSED"

#python do_display_banner() {
#    bb.plain("***********************************************");
#    bb.plain("*                                             *");
#    bb.plain("*  Recipes to build bootgen from xillinx      *");
#    bb.plain("*   for raspberry pi2                         *");
#    bb.plain("***********************************************");
#}

DEPENDS +="openssl"

#unsucessfull attemps to load the files.. 

#SRC_URI ="git@github.com:Xilinx/bootgen.git"
SRCREV="f9f477adf243fa40bc8c7316a7aac37a0efd426d"
SRC_URI="https://github.com/Xilinx/bootgen.git"
S = "${WORKDIR}/git"

#SRC_URI ="file://*"

#inherit autotools

#SRCREV="f9f477adf243fa40bc8c7316a7aac37a0efd426d"
#S="/home/ydesiles/test/poky/meta-bootgen/recipes-bootgen/"




#do_install() {
#         install -d ${D}${bindir}
#         install -m 0755 bootgen ${D}${bindir}
#}
