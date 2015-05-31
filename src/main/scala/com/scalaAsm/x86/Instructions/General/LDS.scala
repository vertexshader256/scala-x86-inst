package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Far Pointer
// Category: general/datamovsegreg

trait LDS extends InstructionDefinition {
  val mnemonic = "LDS"
}

object LDS extends TwoOperands[LDS] with LDSImpl

trait LDSImpl extends LDS {
  implicit object LDS_0 extends _2[r16, m] {
    val opcode: OneOpcode = 0xC5 /r
    val format = RegRmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }

  implicit object LDS_1 extends _2[r32, m] {
    val opcode: OneOpcode = 0xC5 /r
    val format = RegRmFormat
    override def hasImplicitOperand = true
    val hasRMByte = true
  }
}
