package net.numa08.dsl

import scala.collection.mutable.ArrayBuffer


class Performer(name : String) {
	val cs = ArrayBuffer[String]()

	def -(content: String) : Performer = {
		cs += content
		this
	}

	override def toString = {
		name + "\n" + cs.mkString("\t-", "\n\t-", "\n")
	}
}

trait Performers {
	val ps = ArrayBuffer[Performer]()

	def add(name : String) : Performer = {
		val p = new Performer(name)
		ps += p
		p
	}

	implicit def string2performer(name : String) : Performer = {
		val p = add(name)
		p
	}
}
