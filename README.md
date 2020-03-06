# snet-plugin
xnat plugin providing basic data types for sleep research sessions

## prerequisites

* gradle

## build

```
./gradlew jar 
```

## install

```
cp build/libs/snet01-plugin-1.0.0.jar /path/to/xnat/plugins
```

## configure

* login to xnat
* go to `Administer -> Data Types -> Set Up Additional Data types` and add all the `snet01:*` data-types.
