@echo Off
cd build/
IF EXIST Principal.class (
    java Principal
)
pause