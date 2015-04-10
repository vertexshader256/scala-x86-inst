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

object JLE extends JLE with OneOperand[JLE] with JLEImpl

trait JLEImpl {
  self: JLE =>
  implicit object JLE_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x7E
  }

  implicit object JLE_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8E)
  }

  implicit object JLE_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8E)
  }
}
