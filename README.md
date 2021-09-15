[![Build Status](https://travis-ci.org/clulab/sbt-project-small.g8.svg?branch=main)](https://travis-ci.org/clulab/sbt-project-small.g8)

# sbt-project-small.g8

This is a [Giter8](http://foundweekends.org/giter8) template for creating a small `sbt` project for a Scala application.  It is specifically for the  [CLU Lab](http://github.com/clulab) because it includes URLs to the lab's [Artifactory](http://artifactory.cs.arizona.edu:8081/artifactory/webapp/#/home) and [Sonatype](https://oss.sonatype.org/index.html#nexus-search;quick~clulab) servers, which wouldn't work for other groups, and it uses conventions and practices that are particular to this lab.  For a small project, all the code is contained in the root directory.

To use this template as an `sbt` project, do not clone it, but instead run
```
$ sbt new http://github.com/clulab/sbt-project-small.g8.git
```
and when prompted, give values for `name`, `package`, and `class`.  This should result in an `sbt` project called `<name>` in the current directory of your hard drive.  There may be extra files produced that you don't need and can erase.  Some variables like `artifactory` and `compress` are set to default values so as not to inundate you with questions.  Their values can be changed later. 

If you want to modify the template itself, then do clone the project from `github` and change what you'd like.  Test it by running `g8` from `sbt` and finding the results in the `./target/g8` directory.
```
$ git clone http://githubcom/clulab/sbt-project-small.g8
$ cd sbt-project-small.g8
$ sbt g8
$ cd target/g8
```
The template language used by `g8` is taken from [StringTemplate](https://github.com/antlr/stringtemplate4/) and its [documentation](https://github.com/antlr/stringtemplate4/blob/master/doc/index.md) is very helpful.
