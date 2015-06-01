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

object AAA extends ZeroOperands[AAA] with AAAImpl

trait AAAImpl extends AAA {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x37
        override def hasImplicitOperand = true
  }
}
