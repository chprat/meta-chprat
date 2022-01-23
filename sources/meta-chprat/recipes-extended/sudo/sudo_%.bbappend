do_install:append() {
    sed -i "s/# %wheel ALL=(ALL) NOPASSWD: ALL/%wheel ALL=(ALL) NOPASSWD: ALL/" ${D}${sysconfdir}/sudoers
}
