package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Input from Port to String
// Category: general/inoutstring

trait INS extends InstructionDefinition {
  val mnemonic = "INS"
}

object INS extends INS with INSImpl

trait INSImpl {
  self: INS =>
  implicit object INS_0 extends _0 {
    val opcode: OneOpcode = 0x6C
    override def hasImplicitOperand = true
  }
}
