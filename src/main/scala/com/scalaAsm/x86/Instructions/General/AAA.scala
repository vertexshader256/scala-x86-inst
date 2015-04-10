package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: ASCII Adjust After Addition
// Category: general/arith/decimal

trait AAA extends InstructionDefinition {
  val mnemonic = "AAA"
}

object AAA extends AAA with ZeroOperands[AAA] with AAAImpl

trait AAAImpl {
  self: AAA =>
  implicit object AAA_0 extends _0 {
    val opcode: OneOpcode = 0x37
    override def hasImplicitOperand = true
  }
}
