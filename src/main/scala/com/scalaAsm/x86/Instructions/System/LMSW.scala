package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Machine Status Word
// Category: general

trait LMSW extends InstructionDefinition {
  val mnemonic = "LMSW"
}

object LMSW extends OneOperand[LMSW] with LMSWImpl

trait LMSWImpl extends LMSW {
  implicit object _0 extends OneOp[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 6
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
