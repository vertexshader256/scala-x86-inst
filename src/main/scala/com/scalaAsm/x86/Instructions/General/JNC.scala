package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not below/above or equal/not carry (CF=0)
// Category: general/branch/cond

object JNC extends InstructionDefinition("JNC") with JNCImpl

trait JNCImpl {
  implicit object JNC_0 extends JNC._1[rel8] {
    val opcode: OneOpcode = 0x73
  }

  implicit object JNC_1 extends JNC._1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x83)
  }

  implicit object JNC_2 extends JNC._1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x83)
  }
}
