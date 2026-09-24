
Lets a consumer artifact use a dependency that causes banned repositories to be added to the build.

# Reproducer steps

1. `cd dependency && mvn install && cd ..`
2. `rm -R local-repo/androidx` - needed to cause the artifact to be downloaded again
3. `cd consumer && mvn package`

To start over, delete local-repo and target directories and do it again.

