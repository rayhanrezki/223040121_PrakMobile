class PersegiPanjang(private val panjang: Int, private val lebar: Int) {
  fun hitungLuas(): Int {
    return panjang * lebar
}
fun hitungKeliling(): Int {
  return 2 * (panjang + lebar)
  }
}
fun main() {
  val panjang = 4 // Gantilah dengan nilai yang diinginkan
  val lebar = 2 // Gantilah dengan nilai yang diinginkan

  val persegiPanjang = PersegiPanjang(panjang, lebar)
  println("Panjang: $panjang")
  println("Lebar: $lebar")
  println("Luas: ${persegiPanjang.hitungLuas()}")
  println("Keliling: ${persegiPanjang.hitungKeliling()}")
}