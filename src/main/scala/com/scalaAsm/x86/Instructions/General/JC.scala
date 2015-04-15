package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if below/not above or equal/carry (CF=1)
// Category: general/branch/cond

trait JC extends InstructionDefinition {
  val mnemonic = "JC"
}

object JC extends OneOperand[JC] with JCImpl

trait JCImpl extends JC {
  implicit object JC_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x72
  }

  implicit object JC_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x82)
  }

  implicit object JC_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x82)
  }
}
