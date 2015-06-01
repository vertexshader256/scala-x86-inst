package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set AL If Carry
// Category: general/datamov

trait SETALC extends InstructionDefinition {
  val mnemonic = "SETALC"
}

object SETALC extends ZeroOperands[SETALC] with SETALCImpl

trait SETALCImpl extends SETALC {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD6
        override def hasImplicitOperand = true
  }
}
