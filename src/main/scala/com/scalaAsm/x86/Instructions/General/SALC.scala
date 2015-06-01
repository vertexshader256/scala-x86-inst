package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set AL If Carry
// Category: general/datamov

trait SALC extends InstructionDefinition {
  val mnemonic = "SALC"
}

object SALC extends ZeroOperands[SALC] with SALCImpl

trait SALCImpl extends SALC {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD6
        override def hasImplicitOperand = true
  }
}
