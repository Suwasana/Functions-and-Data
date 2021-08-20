object Bank extends App{
  var bank : List[BankAccount] = List( new BankAccount("Suwasana" , 1 , -1000) , new BankAccount("Dammithu" , 2 , 2000) )

  val find = ( n : Int , b : List[BankAccount]) => b.filter( x => x.accountNumber.equals( n ))

  val overdraft = ( b : List[BankAccount] ) => b.filter( x => x.balance < 0)

  val balance = ( b: List[BankAccount] ) => b.map( x => (x,x.balance) ).reduce( (a , c) => ( c._1 , a._2 + c._2) )

  val interest = ( b : List[BankAccount] ) => b.map( x => {
    x.balance match {
      case a if a >= 0 => x deposit x.balance * 0.05
      case _ => x withdraw Math.abs(x.balance) * 0.01

    }
    x
  })


  println("bank " + bank )
  println()
  println("find " + find( 2 , bank) )
  println()
  println("overdraft " + overdraft( bank ) )
  println()
  println("balance " + balance( bank )._2 )
  println()

  bank = interest( bank )

  println("bank " + bank )
  println()
  println("balance " + balance( bank )._2 )
  println()




}
