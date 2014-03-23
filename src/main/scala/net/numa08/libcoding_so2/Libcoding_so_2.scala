package net.numa08.libcoding_so2

import java.lang.Thread
import scala.util.Random
import net.numa08.dsl._

object Libcoding_so_2 extends App with Performers{

"ねおさん".
 - ("https://twitter.com/noir_neo").
 - ("Androidにミクさんを召喚してセクハラしたい！").
 - ("Java/Android").
 - ("ライブラリを使ってAndroidにミクさんを表示して、ナニかしたいと思います。")

"mironalさん".
 - ("https://twitter.com/mironal").
 - ("arduinode を使ってお手軽ハードウェア制御").
 - ("Arduino + node.js + WebSocket").
 - ("自分の作ったライブラリ(arduinode)で、ナニかしたいと思います").
 - ("https://github.com/mironal/arduinode")

"けいま".
 - ("https://twitter.com/pside").
 - ("WebAudio APIと戯れる").
 - ("HTML5 (JavaScript)").
 - ("せっかくなのでDJさんとイチャイチャしてみたかったんだ")

Random.shuffle(ps).foreach { p =>
		Thread.sleep(5 * 1000)
		println(p)
	}
}