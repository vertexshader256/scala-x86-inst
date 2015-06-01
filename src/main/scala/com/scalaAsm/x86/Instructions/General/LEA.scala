package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Effective Address
// Category: general/datamov

trait LEA extends InstructionDefinition {
  val mnemonic = "LEA"
}

object LEA extends TwoOperands[LEA] with LEAImpl

trait LEAImpl extends LEA {
  implicit object LEA_0 extends _2[r16, m] {
    val opcode: OneOpcode = 0x8D /r
    val format = RegRmFormat
  }

  implicit object LEA_1 extends _2[r32, m] {
    val opcode: OneOpcode = 0x8D /r
    val format = RegRmFormat
  }

  implicit object LEA_2 extends _2[r64, m] {
    val opcode: OneOpcode = 0x8D /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
