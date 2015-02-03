package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if below/not above or equal/carry (CF=1)
// Category: general/branch/cond

object JB extends InstructionDefinition("JB") with JBImpl

trait JBImpl {
  implicit object JB_0 extends JB._1[rel8] {
    val opcode: OneOpcode = 0x72
  }

  implicit object JB_1 extends JB._1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x82)
  }

  implicit object JB_2 extends JB._1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x82)
  }
}
