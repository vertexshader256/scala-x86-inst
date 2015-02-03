package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump
// Category: general/branch

object JMP extends InstructionDefinition("JMP") with JMPImpl

trait JMPLow {
  implicit object JMP_0 extends JMP._1[rm16] {
    val opcode: OneOpcode = 0xFF /+ 4
  }

  implicit object JMP_1 extends JMP._1[rm32] {
    val opcode: OneOpcode = 0xFF /+ 4
  }

  implicit object JMP_2 extends JMP._1[rm64] {
    val opcode: OneOpcode = 0xFF /+ 4
  }
}

trait JMPImpl extends JMPLow {
  implicit object JMP_3 extends JMP._1[rel16] {
    val opcode: OneOpcode = 0xE9
  }

  implicit object JMP_4 extends JMP._1[rel32] {
    val opcode: OneOpcode = 0xE9
  }

  implicit object JMP_5 extends JMP._1[rel8] {
    val opcode: OneOpcode = 0xEB
  }
}
