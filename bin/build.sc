import mill._, scalalib._

// `HelloWorld` must match the subdirectory name
object HelloWorld extends ScalaModule {
    def scalaVersion = "2.13.1"

    object test extends Tests {

        def ivyDeps = Agg(
            ivy"junit:junit:4.12",
            ivy"com.novocode:junit-interface:0.11"
        )

        def testFrameworks = Seq("com.novocode.junit.JUnitFramework")
    }
}
