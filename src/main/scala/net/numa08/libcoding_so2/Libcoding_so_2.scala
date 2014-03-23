package net.numa08.libcoding_so2

import net.numa08.dsl._

object Libcoding_so_2 extends App with Performers{

	"ねおさん".
		-("なんかやる")

	"mironalさん".
		-("なんかやる")

	"けいまさん".
		-("なんかやる")
	
	ps.foreach(println(_))
}
