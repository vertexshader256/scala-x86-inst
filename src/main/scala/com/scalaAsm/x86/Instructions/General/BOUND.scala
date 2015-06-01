package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Check Array Index Against Bounds
// Category: general/breakstack

trait BOUND extends InstructionDefinition {
  val mnemonic = "BOUND"
}

object BOUND extends TwoOperands[BOUND] with BOUNDImpl

trait BOUNDImpl extends BOUND {
  implicit object _0 extends TwoOp[r16, m16] {
    val opcode: OneOpcode = 0x62 /r
    val format = RegRmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends TwoOp[r32, m32] {
    val opcode: OneOpcode = 0x62 /r
    val format = RegRmFormat
    override def hasImplicitOperand = true
  }
}
