package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Convert
// Category: general/conver

trait CDQE extends InstructionDefinition {
  val mnemonic = "CDQE"
}

object CDQE extends CDQE with CDQEImpl

trait CDQEImpl {
  self: CDQE =>
  implicit object CDQE_0 extends _0 {
    val opcode: OneOpcode = 0x98
    override def hasImplicitOperand = true
  }
}
