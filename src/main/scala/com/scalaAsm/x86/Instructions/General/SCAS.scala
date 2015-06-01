package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Scan String
// Category: general/arithstring/binary

trait SCAS extends InstructionDefinition {
  val mnemonic = "SCAS"
}

object SCAS extends ZeroOperands[SCAS] with SCASImpl

trait SCASImpl extends SCAS {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xAE
        override def hasImplicitOperand = true
  }
}
