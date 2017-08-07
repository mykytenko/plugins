# plugins

plugin-sdk <==> plugins <==> report-service

Test plugins for report-service project.

Every plugin needs to have a dependency to plugin-sdk:
```
<dependency>
    <groupId>com.tests</groupId>
    <artifactId>plugin-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

Plugins should be located in `/plugin` folder.
