package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if overflow (OF=1)
// Category: general/branch/cond

object JO extends InstructionDefinition("JO") with JOImpl

trait JOImpl {
  implicit object JO_0 extends JO._1[rel8] {
    val opcode: OneOpcode = 0x70
  }

  implicit object JO_1 extends JO._1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x80)
  }

  implicit object JO_2 extends JO._1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x80)
  }
}
