name := "$name$"

organization := "$organization$"

scalaVersion := "$scalaversion$"

version := "0.0.1-SNAPSHOT"

resolvers ++= Seq("spray repo" at "http://repo.spray.io")

libraryDependencies ++= {
 val akkaVersion = "$akkaversion$"
 val sprayVersion = "$sprayversion$"
 Seq( "com.typesafe.akka" %% "akka-actor" % akkaVersion
 	, "io.spray" %% "spray-can" % sprayVersion
 	, "io.spray" %% "spray-routing" % sprayVersion
 	, "io.spray" %% "spray-testkit" % sprayVersion
 	, "com.fasterxml.jackson.module" %% "jackson-module-scala" % "$jacksonscalaversion$"
 	, "org.scalatest" %% "scalatest" % "$scalatestversion$" % "test"
 )
 }

javaOptions ++= Seq("-Djava.net.preferIPv4Stack=true")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-Xlint", "-Ywarn-dead-code", "-encoding", "UTF-8")
