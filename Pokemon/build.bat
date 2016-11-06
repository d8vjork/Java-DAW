IF EXIST manifest.mf (
    jar -cvfm Pokemon.jar manifest.mf -C build/ .
)