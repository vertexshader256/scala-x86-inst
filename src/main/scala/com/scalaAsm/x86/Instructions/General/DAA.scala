package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Decimal Adjust AL after Addition
// Category: general/arith/decimal

trait DAA extends InstructionDefinition {
  val mnemonic = "DAA"
}

object DAA extends ZeroOperands[DAA] with DAAImpl

trait DAAImpl extends DAA {
  implicit object DAA_0 extends _0 {
    val opcode: OneOpcode = 0x27
        override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
