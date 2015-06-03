package com.scalaAsm.x86
package Instructions
package General

// Description: Jump
// Category: general/branch

trait JMP extends InstructionDefinition {
  val mnemonic = "JMP"
}

object JMP extends OneOperand[JMP] with JMPImpl

trait JMPLow extends JMP {
  implicit object _0 extends OneOp[rm16] {
    val opcode: OneOpcode = 0xFF /+ 4
    val format = RmFormat
  }

  implicit object _1 extends OneOp[rm32] {
    val opcode: OneOpcode = 0xFF /+ 4
    val format = RmFormat
  }

  implicit object _2 extends OneOp[rm64] {
    val opcode: OneOpcode = 0xFF /+ 4
    val format = RmFormat
  }
}

trait JMPImpl extends JMPLow {
  implicit object _3 extends OneOp[rel16] {
    val opcode: OneOpcode = 0xE9
    val format = ImmFormat
  }

  implicit object _4 extends OneOp[rel32] {
    val opcode: OneOpcode = 0xE9
    val format = ImmFormat
  }

  implicit object _5 extends OneOp[rel8] {
    val opcode: OneOpcode = 0xEB
    val format = ImmFormat
  }
}
