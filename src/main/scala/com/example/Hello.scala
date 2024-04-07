package com.example

import scala.scalajs.js.annotation._
import scala.scalajs.js

object Hello {

  @JSExportTopLevel(name = "run", moduleID = "hello")
  def run(event: js.Object, context: js.Object, callback: js.Function2[js.Error, js.Object, js.Object]): js.Object = {
    val response = scalajs.js.Dynamic.literal(
      statusCode = 200,
      body = "Hello, World!",
      headers = js.Dynamic.literal(
        `Content-Type` = "text/plain",
      ),
      isBase64Encoded = false,
    )
    callback(null, response)
  }

}
