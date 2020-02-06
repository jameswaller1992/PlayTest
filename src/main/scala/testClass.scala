class CheckSumAccumulator{
  //class definition goes in here
  private var sum = 0

  def add(b:Byte):Unit = {
    sum += b
  }

  def checksum(): Int = {
    return ~(sum & 0xFF) + 1
  }
}

val acc = new CheckSumAccumulator
val csa = new CheckSumAccumulator


