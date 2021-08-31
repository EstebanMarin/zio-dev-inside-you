package com.estebanmarin
package zioplaygound

import ourzio.*

object Main extends App:
  val trace = s"[${scala.Console.BLUE}TRACE${scala.Console.RESET}]"

  val myAppLogic =
    for
      _ <- console.putStrLn("-" * 50)
      _ <- console.putStrLn("What's your name?" * 50)
      name <- console.getStrLn
      _ <- console.putStrLn(s"Hello $name")
    yield ()

  Runtime.default.unsafeRunSync(myAppLogic)
