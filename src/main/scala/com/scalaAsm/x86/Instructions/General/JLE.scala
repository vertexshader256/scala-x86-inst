package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if less or equal/not greater ((ZF=1) OR (SF!=OF))
// Category: general/branch/cond

trait JLE extends InstructionDefinition {
  val mnemonic = "JLE"
}

object JLE extends OneOperand[JLE] with JLEImpl

trait JLEImpl extends JLE {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x7E
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8E)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8E)
    val format = ImmFormat
  }
}
