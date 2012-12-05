Run `java -jar release/release.jar`

If the frame is green, the libraries were loaded successfully.
If the frame is red, the auto loading process failed.

## Making changes to the source (within Eclipse)

If you've made changes to Driver, recompile the application jar (release/onejar/main/jogamp-onejar.jar)
using jogamp-onejar.jardesc.  It only needs to include the Driver class.

## Rebuilding release.jar (from the command line)

To build the release run:

cd release/onejar && jar -cvfm ../release.jar boot-manifest.mf .
