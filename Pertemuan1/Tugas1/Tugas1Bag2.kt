class IndeksNilaiMatkul(private val nilaiAkhir: Int) {
  fun hitungIndeks(): String {
    return when {
      nilaiAkhir in 80..100 -> "A"
      nilaiAkhir in 70..79 -> "AB"
      nilaiAkhir in 60..69 -> "B"
      nilaiAkhir in 50..59 -> "BC"
      nilaiAkhir in 40..49 -> "C"
      nilaiAkhir in 30..39 -> "D"
      nilaiAkhir in 0..29 -> "E"
      else -> "Nilai di luar jangkauan"
    }
  }
}
fun main() {
  val nilaiAkhirList = listOf(77, 110, 25, 89) // Ubah nilai ini sesuai kebutuhan
  for (nilaiAkhir in nilaiAkhirList) {
    val indeksNilai = IndeksNilaiMatkul(nilaiAkhir)
    println("Nilai: $nilaiAkhir -> Indeks: ${indeksNilai.hitungIndeks()}")
  }
}