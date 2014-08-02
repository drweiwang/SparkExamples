name := "SparkExamples"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.0.1"

libraryDependencies += "org.apache.spark" %% "spark-mllib" % "1.0.1"

libraryDependencies += "com.github.fommil.netlib" % "all" % "1.1.2" pomOnly()

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"