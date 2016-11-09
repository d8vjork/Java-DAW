@echo Off
set /P filename=Enter a filename:

IF "%filename%"=="" GOTO Error

IF EXIST manifest.mf (
    jar -cvfm %filename%.jar manifest.mf -C build/ .
)
GOTO End

:Error
echo Fatal error!
:End
pause