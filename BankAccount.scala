class BankAccount ( x:String , y: Int , z : Double){
  val NIC : String = x
  val accountNumber : Int = y
  var balance : Double = z

  def withdraw( amount : Double ) = this.balance -= amount

  def deposit ( amount : Double ) = this.balance += amount

  def transfer( amount : Double , that : BankAccount ): Unit = {
    this.balance =  this.balance - amount
    that.balance = that.balance + amount
  }


  @Override
  override def toString() : String = "NIC : " + this.NIC + "\n Account Number : " + this.accountNumber + "\n Balance : " + this.balance

}


