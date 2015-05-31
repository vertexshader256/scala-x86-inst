package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Adjust AX Before Division
// Category: general/arith/decimal

trait ADX extends InstructionDefinition {
  val mnemonic = "ADX"
}

object ADX extends OneOperand[ADX] with ADXImpl

trait ADXImpl extends ADX {
  implicit object ADX_0 extends _1[imm8] {
    val opcode: OneOpcode = 0xD5
    val format = ImmFormat
    override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
