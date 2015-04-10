package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Call Procedure
// Category: general/branchstack

trait CALL extends InstructionDefinition {
  val mnemonic = "CALL"
}

object CALL extends CALL with OneOperand[CALL] with CALLImpl

trait CALLLow {
  self: CALL =>
  implicit object CALL_0 extends _1[rm16] {
    val opcode: OneOpcode = 0xFF /+ 2
    override def hasImplicitOperand = true
  }

  implicit object CALL_1 extends _1[rm32] {
    val opcode: OneOpcode = 0xFF /+ 2
    override def hasImplicitOperand = true
  }

  implicit object CALL_2 extends _1[rm64] {
    val opcode: OneOpcode = 0xFF /+ 2
    override def hasImplicitOperand = true
  }
}

trait CALLImpl extends CALLLow {
  self: CALL =>
  implicit object CALL_3 extends _1[rel16] {
    val opcode: OneOpcode = 0xE8
    override def hasImplicitOperand = true
  }

  implicit object CALL_4 extends _1[rel32] {
    val opcode: OneOpcode = 0xE8
    override def hasImplicitOperand = true
  }
}
