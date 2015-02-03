package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if below or equal/not above (CF=1 AND ZF=1)
// Category: general/branch/cond

object JBE extends InstructionDefinition("JBE") with JBEImpl

trait JBEImpl {
  implicit object JBE_0 extends JBE._1[rel8] {
    val opcode: OneOpcode = 0x76
  }

  implicit object JBE_1 extends JBE._1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x86)
  }

  implicit object JBE_2 extends JBE._1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x86)
  }
}
