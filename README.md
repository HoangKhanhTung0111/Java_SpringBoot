# Java_SpringBoot
# Link tutorial: https://www.youtube.com/watch?v=Nv2DERaMx-4

## 1: Build tool: Apache Maven
### a) Overall
    - It help Devs manage their project 
      and all the thing they need to build their program
    - Help build and test project
    - Pack the project into a dependency,
      so it can be share to other people
### b) 3 phase:
    - Clean: Remove temporary dir and file
    - Default: Where you do your build, test
    - Site: Where doc is generate
#### Clean: 
    - pre-clean: hook for after cleaning
    - clean: does the actual cleaning (remove the "target" dir)
    - post_clean: hook for after cleaning
#### Default: 
    i) compile: compile your code into bytecode
    ii) test: run unit test
    iii) package: create a jar or war file
    iiii) verify: run checks and integration test
### c) Maven project structure
    - src/main/java: Contain java file
    - src/main/resources: Contain static and config file
    - src/test/java: Contain test   