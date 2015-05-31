package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Decimal Adjust AL after Subtraction
// Category: general/arith/decimal

trait DAS extends InstructionDefinition {
  val mnemonic = "DAS"
}

object DAS extends ZeroOperands[DAS] with DASImpl

trait DASImpl extends DAS {
  implicit object DAS_0 extends _0 {
    val opcode: OneOpcode = 0x2F
        override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
