package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump
// Category: general/branch

trait JMP extends InstructionDefinition {
  val mnemonic = "JMP"
}

object JMP extends OneOperand[JMP] with JMPImpl

trait JMPLow extends JMP {
  implicit object JMP_0 extends _1[rm16] {
    val opcode: OneOpcode = 0xFF /+ 4
  }

  implicit object JMP_1 extends _1[rm32] {
    val opcode: OneOpcode = 0xFF /+ 4
  }

  implicit object JMP_2 extends _1[rm64] {
    val opcode: OneOpcode = 0xFF /+ 4
  }
}

trait JMPImpl extends JMPLow {
  implicit object JMP_3 extends _1[rel16] {
    val opcode: OneOpcode = 0xE9
  }

  implicit object JMP_4 extends _1[rel32] {
    val opcode: OneOpcode = 0xE9
  }

  implicit object JMP_5 extends _1[rel8] {
    val opcode: OneOpcode = 0xEB
  }
}
